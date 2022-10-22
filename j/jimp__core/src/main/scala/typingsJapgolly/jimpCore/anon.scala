package typingsJapgolly.jimpCore

import typingsJapgolly.jimpCore.typesEtcMod.Image
import typingsJapgolly.jimpCore.typesPluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.typesPluginsMod.JimpType
import typingsJapgolly.jimpCore.typesUtilsMod.FunctionRet
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginFuncArrDecoders
import typingsJapgolly.jimpCore.typesUtilsMod.GetPluginFuncArrEncoders
import typingsJapgolly.jimpCore.typesUtilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Class extends StObject {
    
    var `class`: js.UndefOr[scala.Nothing] = js.undefined
    
    var constants: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Decoders[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] extends StObject {
    
    var decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]
    
    var encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
  }
  object Decoders {
    
    inline def apply[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */](
      decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]],
      encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
    ): Decoders[PluginFuncArr] = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoders[PluginFuncArr]]
    }
    
    extension [Self <: Decoders[?], PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */](x: Self & Decoders[PluginFuncArr]) {
      
      inline def setDecoders(value: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
