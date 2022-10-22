package typingsJapgolly.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drouting {
  
  @JSGlobal("KSR.drouting")
  @js.native
  val ^ : js.Any = js.native
  
  inline def doRouting(grp_id: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("do_routing")(grp_id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def doRoutingFuri(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("do_routing_furi")().asInstanceOf[Double]
  
  inline def goesToGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("goes_to_gw")().asInstanceOf[Double]
  
  inline def goesToGwType(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("goes_to_gw_type")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isFromGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_from_gw")().asInstanceOf[Double]
  
  inline def isFromGwType(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_from_gw_type")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isFromGwTypeFlags(`type`: Double, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_from_gw_type_flags")(`type`.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nextRouting(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("next_routing")().asInstanceOf[Double]
  
  inline def useNextGw(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("use_next_gw")().asInstanceOf[Double]
}
