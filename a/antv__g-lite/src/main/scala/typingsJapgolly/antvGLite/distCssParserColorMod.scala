package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.antvGLiteStrings.`no-repeat`
import typingsJapgolly.antvGLite.antvGLiteStrings.`repeat-x`
import typingsJapgolly.antvGLite.antvGLiteStrings.`repeat-y`
import typingsJapgolly.antvGLite.antvGLiteStrings.repeat
import typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue
import typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB
import typingsJapgolly.std.CanvasImageSource
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssParserColorMod {
  
  @JSImport("@antv/g-lite/dist/css/parser/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPattern(`object`: Any): /* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean]
  
  inline def mergeColors(left: js.Array[CSSGradientValue], right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: js.Array[CSSGradientValue], right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: js.Array[CSSGradientValue], right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: CSSRGB, right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: js.Array[CSSGradientValue]): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: CSSRGB): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  inline def mergeColors(left: Pattern, right: Pattern): js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Tuple3[
      js.Array[Double], 
      js.Array[Double], 
      js.Function1[/* color */ js.Array[Double], String]
    ]
  ]]
  
  object parseColor {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/parser/color", "parseColor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/parser/color", "parseColor.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  trait Pattern extends StObject {
    
    var image: String | CanvasImageSource
    
    var repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat`
  }
  object Pattern {
    
    inline def apply(image: String | CanvasImageSource, repetition: repeat | `repeat-x` | `repeat-y` | `no-repeat`): Pattern = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], repetition = repetition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setImage(value: String | CanvasImageSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setRepetition(value: repeat | `repeat-x` | `repeat-y` | `no-repeat`): Self = StObject.set(x, "repetition", value.asInstanceOf[js.Any])
    }
  }
}
