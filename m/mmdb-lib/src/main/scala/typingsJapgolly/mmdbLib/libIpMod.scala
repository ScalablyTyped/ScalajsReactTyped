package typingsJapgolly.mmdbLib

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIpMod {
  
  object default {
    
    @JSImport("mmdb-lib/lib/ip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def bitAt(rawAddress: js.Array[Double], idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bitAt")(rawAddress.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def bitAt(rawAddress: Buffer, idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bitAt")(rawAddress.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def parse(ip: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    inline def validate(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
