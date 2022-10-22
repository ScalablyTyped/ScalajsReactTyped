package typingsJapgolly.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidatorsMod {
  
  @JSImport("konva/lib/Validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RGBComponent(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBComponent")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def alphaComponent(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaComponent")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBooleanValidator(): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
  
  inline def getComponentValidator(components: Any): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentValidator")(components.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
  
  inline def getFunctionValidator(): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
  
  inline def getNumberArrayValidator(): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberArrayValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
  
  inline def getNumberOrArrayOfNumbersValidator(noOfElements: Double): js.Function2[/* val */ Any, /* attr */ String, Unit | Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrArrayOfNumbersValidator")(noOfElements.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Unit | Any]]
  
  inline def getNumberOrAutoValidator(): js.Function2[/* val */ String, /* attr */ String, Unit | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrAutoValidator")().asInstanceOf[js.Function2[/* val */ String, /* attr */ String, Unit | String]]
  
  inline def getNumberValidator(): js.Function2[/* val */ Any, /* attr */ String, Unit | Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Unit | Any]]
  
  inline def getStringOrGradientValidator(): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringOrGradientValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
  
  inline def getStringValidator(): js.Function2[/* val */ Any, /* attr */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValidator")().asInstanceOf[js.Function2[/* val */ Any, /* attr */ String, Any]]
}
