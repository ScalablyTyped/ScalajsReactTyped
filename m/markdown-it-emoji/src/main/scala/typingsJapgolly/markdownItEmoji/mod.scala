package typingsJapgolly.markdownItEmoji

import typingsJapgolly.markdownIt.libMod.PluginSimple
import typingsJapgolly.markdownIt.libMod.PluginWithOptions
import typingsJapgolly.markdownItEmoji.anon._empty
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.angry
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.blush
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.broken_heart
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.confused
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.cry
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.frowning
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.heart
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.imp
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.innocent
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.joy
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.kissing
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.laughing
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.neutral_face
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.open_mouth
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.rage
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.smile
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.smiley
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.smiling_imp
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.sob
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.stuck_out_tongue
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.sunglasses
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.sweat
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.sweat_smile
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.unamused
import typingsJapgolly.markdownItEmoji.markdownItEmojiStrings.wink
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod
  extends org.scalablytyped.runtime.Shortcut {
  
  @JSImport("markdown-it-emoji", JSImport.Namespace)
  @js.native
  val ^ : PluginSimple | PluginWithOptions[Options] = js.native
  
  type LiteralUnion[T /* <: U */, U] = T | (U & _empty)
  
  trait Options extends StObject {
    
    var defs: js.UndefOr[Record[String, String]] = js.undefined
    
    var enabled: js.UndefOr[js.Array[String]] = js.undefined
    
    var shortcuts: js.UndefOr[Shortcuts] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefs(value: Record[String, String]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setEnabled(value: js.Array[String]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEnabledVarargs(value: String*): Self = StObject.set(x, "enabled", js.Array(value*))
      
      inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in K ]:? T | std.Array<T>}
    }}}
    */
  @js.native
  trait PartialRecord[K /* <: /* keyof any */ String */, T] extends StObject
  
  type Shortcut = LiteralUnion[
    angry | blush | broken_heart | confused | cry | frowning | heart | imp | innocent | joy | kissing | laughing | neutral_face | open_mouth | rage | smile | smiley | smiling_imp | sob | stuck_out_tongue | sunglasses | sweat_smile | sweat | unamused | wink, 
    String
  ]
  
  type Shortcuts = PartialRecord[Shortcut, String]
  
  type _To = PluginSimple | PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginSimple | PluginWithOptions[Options] = ^
}
