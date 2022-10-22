package typingsJapgolly.chance.Chance

import typingsJapgolly.chance.chanceStrings.all
import typingsJapgolly.chance.chanceStrings.female
import typingsJapgolly.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixOptions
  extends StObject
     with SuffixOptions {
  
  var gender: male | female | all
}
object PrefixOptions {
  
  inline def apply(full: Boolean, gender: male | female | all): PrefixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixOptions]
  }
  
  extension [Self <: PrefixOptions](x: Self) {
    
    inline def setGender(value: male | female | all): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
  }
}
