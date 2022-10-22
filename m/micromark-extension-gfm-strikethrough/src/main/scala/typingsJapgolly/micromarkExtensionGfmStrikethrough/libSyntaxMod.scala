package typingsJapgolly.micromarkExtensionGfmStrikethrough

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxMod {
  
  @JSImport("micromark-extension-gfm-strikethrough/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmStrikethrough(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")().asInstanceOf[Extension]
  inline def gfmStrikethrough(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Event = typingsJapgolly.micromarkUtilTypes.mod.Event
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  trait Options extends StObject {
    
    /**
      * Whether to support strikethrough with a single tilde (`boolean`, default:
      * `true`).
      * Single tildes work on github.com, but are technically prohibited by the
      * GFM spec.
      */
    var singleTilde: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSingleTilde(value: Boolean): Self = StObject.set(x, "singleTilde", value.asInstanceOf[js.Any])
      
      inline def setSingleTildeUndefined: Self = StObject.set(x, "singleTilde", js.undefined)
    }
  }
  
  type Resolver = typingsJapgolly.micromarkUtilTypes.mod.Resolver
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Token = typingsJapgolly.micromarkUtilTypes.mod.Token
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
