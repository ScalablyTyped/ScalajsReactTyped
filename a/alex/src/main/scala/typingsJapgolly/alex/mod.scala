package typingsJapgolly.alex

import typingsJapgolly.vfile.libMod.Compatible
import typingsJapgolly.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Input): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def default(value: Input, config: Options): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def html(value: Input): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def html(value: Input, config: Options): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def markdown(value: Input): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def markdown(value: Input, config: Options): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("markdown")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def mdx(value: Input): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def mdx(value: Input, config: Options): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def text(value: Input): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def text(value: Input, config: Options): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  type FilterOptions = typingsJapgolly.alex.filterMod.Options
  
  type Input = Compatible
  
  type NoBinaryOption = js.UndefOr[Boolean]
  
  type Options = js.UndefOr[OptionsObject | js.Array[String]]
  
  trait OptionsObject
    extends StObject
       with typingsJapgolly.alex.filterMod.Options {
    
    var noBinary: js.UndefOr[NoBinaryOption] = js.undefined
    
    var profanitySureness: js.UndefOr[SurenessOption] = js.undefined
  }
  object OptionsObject {
    
    inline def apply(): OptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsObject]
    }
    
    extension [Self <: OptionsObject](x: Self) {
      
      inline def setNoBinary(value: NoBinaryOption): Self = StObject.set(x, "noBinary", value.asInstanceOf[js.Any])
      
      inline def setNoBinaryUndefined: Self = StObject.set(x, "noBinary", js.undefined)
      
      inline def setProfanitySureness(value: SurenessOption): Self = StObject.set(x, "profanitySureness", value.asInstanceOf[js.Any])
      
      inline def setProfanitySurenessUndefined: Self = StObject.set(x, "profanitySureness", js.undefined)
    }
  }
  
  type Root = typingsJapgolly.nlcst.mod.Root
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.alex.alexInts.`0`
    - typingsJapgolly.alex.alexInts.`1`
    - typingsJapgolly.alex.alexInts.`2`
    - scala.Unit
  */
  type SurenessOption = js.UndefOr[_SurenessOption]
  
  trait TextOptions extends StObject {
    
    var noBinary: NoBinaryOption
    
    var sureness: SurenessOption
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setNoBinary(value: NoBinaryOption): Self = StObject.set(x, "noBinary", value.asInstanceOf[js.Any])
      
      inline def setNoBinaryUndefined: Self = StObject.set(x, "noBinary", js.undefined)
      
      inline def setSureness(value: SurenessOption): Self = StObject.set(x, "sureness", value.asInstanceOf[js.Any])
      
      inline def setSurenessUndefined: Self = StObject.set(x, "sureness", js.undefined)
    }
  }
  
  trait _SurenessOption extends StObject
}
