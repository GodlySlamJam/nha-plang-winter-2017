  game = {"man"=> {"position"=> {"x"=> 1, "y": 1},
                   "size"=> {"length"=> 1, "width"=> 1},
        #numbersize
                    "costume"=> {"strawberry" => {"length"=> 5, "width"=> 5, "yes"=> 0},
                                 "chocalate" => {"length"=> 2, "width"=> 3, "yes"=> 0},
                                 "mint" => {"length"=> 5, "width"=> 3, "yes"=> 0},
                                 "cookiedough" => {"length"=> 3, "width"=> 1}, "yes"=> 0,
        },

        #numberenable
                    "cone"=>{"sugar" => {"yes"=> 0},
                             "prezetal" => {"yes"=> 0},
                             "waffle" => {"yes"=> 0},
                             "wafer" => {"yes"=> 0},
              },
                    "health"=> 5,
            },
        "monster"=>{"level"=> {"1"=> {"position"=> {"x"=> 1, "y": 1},
                                      "size"=> {"length"=> 5, "width"=> 5},
                                      "damage"=> 1,
                                      "health"=> 5,
                                    },
                               "2"=> {"position"=> {"x"=> 1, "y": 1},
                                      "size"=> {"length"=> 5, "width"=> 5},
                                      "damage"=> 1,
                                      "health"=> 5,
                                    },
                                "3"=> {"position"=> {"x"=> 1, "y": 1},
                                        "size"=> {"length"=> 5, "width"=> 5},
                                        "damage"=> 1,
                                       "health"=> 5,
                                      },
                                "4"=> {"position"=> {"x"=> 1, "y": 1},
                                       "size"=> {"length"=> 5, "width"=> 5},
                                       "damage"=> 1,
                                       "health"=> 5,
                                      },



                                }

      },

        "board"=> {"length"=> 20, "width"=> 20}

}

x = 0
y = 0
array = []

while y < game["board"]["length"]

  array.push(Array.new)
  while x < game["board"]["width"]

    array[y].push("- ")
    x = x + 1

  end
  y = y + 1
  x = 0
end

y = 0
x = 0

while y < game["board"]["length"]

  array.push(Array.new)
  while x < game["board"]["width"]

    print array[y][x]
    x = x + 1

  end
  puts " "
  y = y + 1
  x = 0
end

while x < game["man"]["health"]
  man = [game["man"]["position"]["x"], game["man"]["position"]["y"]]
  #cxzvads

end











puts game["man"]["costume"]["cookiedough"]["length"]
