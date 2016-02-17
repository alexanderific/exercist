defmodule Bob do
  def hey(input) do
    cond do
        String.replace(input, " ", "") == "" or input == "" -> "Fine. Be that way!"

        String.last(input) == "?" -> "Sure."

        String.last(input) == "!" -> "Whoa, chill out!"

        true -> "Whatever."
    end
  end
end
