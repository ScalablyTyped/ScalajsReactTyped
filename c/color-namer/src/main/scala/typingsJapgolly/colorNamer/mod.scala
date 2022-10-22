package typingsJapgolly.colorNamer

import typingsJapgolly.colorNamer.anon.Omit
import typingsJapgolly.colorNamer.anon.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Palette */](color: String): Colors[T] = ^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any]).asInstanceOf[Colors[T]]
  inline def apply[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = (^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[Diff[Palette, T]]]
  inline def apply[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = (^.asInstanceOf[js.Dynamic].apply(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[T]]
  
  @JSImport("color-namer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Color extends StObject {
    
    var distance: Double
    
    var hex: String
    
    var name: String
  }
  object Color {
    
    inline def apply(distance: Double, hex: String, name: String): Color = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Colors[T /* <: Palette */] = Record[T, js.Array[Color]]
  
  type Diff[T /* <: String */, U /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.colorNamer.colorNamerStrings.roygbiv
    - typingsJapgolly.colorNamer.colorNamerStrings.basic
    - typingsJapgolly.colorNamer.colorNamerStrings.html
    - typingsJapgolly.colorNamer.colorNamerStrings.x11
    - typingsJapgolly.colorNamer.colorNamerStrings.pantone
    - typingsJapgolly.colorNamer.colorNamerStrings.ntc
  */
  trait Palette extends StObject
  object Palette {
    
    inline def basic: typingsJapgolly.colorNamer.colorNamerStrings.basic = "basic".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.basic]
    
    inline def html: typingsJapgolly.colorNamer.colorNamerStrings.html = "html".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.html]
    
    inline def ntc: typingsJapgolly.colorNamer.colorNamerStrings.ntc = "ntc".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.ntc]
    
    inline def pantone: typingsJapgolly.colorNamer.colorNamerStrings.pantone = "pantone".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.pantone]
    
    inline def roygbiv: typingsJapgolly.colorNamer.colorNamerStrings.roygbiv = "roygbiv".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.roygbiv]
    
    inline def x11: typingsJapgolly.colorNamer.colorNamerStrings.x11 = "x11".asInstanceOf[typingsJapgolly.colorNamer.colorNamerStrings.x11]
  }
}
