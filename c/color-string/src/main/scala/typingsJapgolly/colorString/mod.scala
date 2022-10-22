package typingsJapgolly.colorString

import typingsJapgolly.colorString.colorStringStrings.hsl
import typingsJapgolly.colorString.colorStringStrings.hwb
import typingsJapgolly.colorString.colorStringStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object get {
    
    inline def apply(colorString: String): ColorDescriptor | Null = ^.asInstanceOf[js.Dynamic].apply(colorString.asInstanceOf[js.Any]).asInstanceOf[ColorDescriptor | Null]
    
    @JSImport("color-string", "get")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hsl[TColorStr /* <: String | Null */](colorString: TColorStr): /* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(colorString.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any]
    
    inline def hwb[TColorStr /* <: String | Null */](colorString: TColorStr): /* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(colorString.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any]
    
    inline def rgb[TColorStr /* <: String | Null */](colorString: TColorStr): /* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(colorString.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TColorStr extends string ? color-string.color-string.Color : null */ js.Any]
  }
  
  object to {
    
    @JSImport("color-string", "to")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hex(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def hsl(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def hwb(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def keyword(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    object rgb {
      
      inline def apply(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
      
      @JSImport("color-string", "to.rgb")
      @js.native
      val ^ : js.Any = js.native
      
      inline def percent(args: (Double | js.Array[Double])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    }
  }
  
  type Color = js.Tuple4[Double, Double, Double, Double]
  
  trait ColorDescriptor extends StObject {
    
    var model: rgb | hsl | hwb
    
    var value: Color
  }
  object ColorDescriptor {
    
    inline def apply(model: rgb | hsl | hwb, value: Color): ColorDescriptor = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorDescriptor]
    }
    
    extension [Self <: ColorDescriptor](x: Self) {
      
      inline def setModel(value: rgb | hsl | hwb): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
