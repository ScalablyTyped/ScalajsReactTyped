package typingsJapgolly.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pvx {
  
  @JSGlobal("KSR.pvx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def evalx(dst: String, fmt: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("evalx")(dst.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def pvVarToXavp(varname: String, xname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pv_var_to_xavp")(varname.asInstanceOf[js.Any], xname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def pvXavpPrint(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pv_xavp_print")().asInstanceOf[Double]
  
  inline def pvXavpToVar(xname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pv_xavp_to_var")(xname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sbranchAppend(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sbranch_append")().asInstanceOf[Double]
  
  inline def sbranchReset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sbranch_reset")().asInstanceOf[Double]
  
  inline def sbranchSetRuri(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sbranch_set_ruri")().asInstanceOf[Double]
  
  inline def xavpParamsExplode(sparams: String, sxname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xavp_params_explode")(sparams.asInstanceOf[js.Any], sxname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def xavpParamsImplode(sxname: String, svname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xavp_params_implode")(sxname.asInstanceOf[js.Any], svname.asInstanceOf[js.Any])).asInstanceOf[Double]
}
