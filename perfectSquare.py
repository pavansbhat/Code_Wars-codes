
def find_next_square(sq):
    # Return the next square if sq is a square, -1 otherwise
    squareRoot=sq**0.5
    if squareRoot.is_integer():
        return (squareRoot+1)**2
    return -1
 
