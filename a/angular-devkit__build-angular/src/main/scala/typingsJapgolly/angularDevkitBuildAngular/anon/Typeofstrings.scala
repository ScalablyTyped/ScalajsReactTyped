package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofstrings extends StObject {
  
  def camelize(str: String): String
  
  def capitalize(str: String): String
  
  def classify(str: String): String
  
  def dasherize(str: String): String
  
  def decamelize(str: String): String
  
  def levenshtein(a: String, b: String): Double
  
  def underscore(str: String): String
}
object Typeofstrings {
  
  inline def apply(
    camelize: String => String,
    capitalize: String => String,
    classify: String => String,
    dasherize: String => String,
    decamelize: String => String,
    levenshtein: (String, String) => Double,
    underscore: String => String
  ): Typeofstrings = {
    val __obj = js.Dynamic.literal(camelize = js.Any.fromFunction1(camelize), capitalize = js.Any.fromFunction1(capitalize), classify = js.Any.fromFunction1(classify), dasherize = js.Any.fromFunction1(dasherize), decamelize = js.Any.fromFunction1(decamelize), levenshtein = js.Any.fromFunction2(levenshtein), underscore = js.Any.fromFunction1(underscore))
    __obj.asInstanceOf[Typeofstrings]
  }
  
  extension [Self <: Typeofstrings](x: Self) {
    
    inline def setCamelize(value: String => String): Self = StObject.set(x, "camelize", js.Any.fromFunction1(value))
    
    inline def setCapitalize(value: String => String): Self = StObject.set(x, "capitalize", js.Any.fromFunction1(value))
    
    inline def setClassify(value: String => String): Self = StObject.set(x, "classify", js.Any.fromFunction1(value))
    
    inline def setDasherize(value: String => String): Self = StObject.set(x, "dasherize", js.Any.fromFunction1(value))
    
    inline def setDecamelize(value: String => String): Self = StObject.set(x, "decamelize", js.Any.fromFunction1(value))
    
    inline def setLevenshtein(value: (String, String) => Double): Self = StObject.set(x, "levenshtein", js.Any.fromFunction2(value))
    
    inline def setUnderscore(value: String => String): Self = StObject.set(x, "underscore", js.Any.fromFunction1(value))
  }
}
