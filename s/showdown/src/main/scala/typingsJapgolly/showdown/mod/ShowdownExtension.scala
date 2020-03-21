package typingsJapgolly.showdown.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a plugin/extension
  * Each single extension can be one of two types:
  *
  * + Language Extension -- Language extensions are ones that that add new markdown syntax to showdown. For example, say you wanted ^^youtube http://www.youtube.com/watch?v=oHg5SJYRHA0 to automatically render as an embedded YouTube video, that would be a language extension.
  * + Output Modifiers -- After showdown has run, and generated HTML, an output modifier would change that HTML. For example, say you wanted to change <div class="header"> to be <header>, that would be an output modifier.
  * + Listener Extension -- Listener extensions for listen to conversion events.
  * 
  * Each extension can provide two combinations of interfaces for showdown.
  * 
  * @example
  * ```ts
  * let myext: ShowdownExtension = {
  *   type: 'output',
  *   filter(text, converter, options) {
  *      // ... do stuff to text ...
  *      return text;
  *   },
  *   listeners: {
  *      ['lists.after'](evtName, text, converter, options, globals){
  *          // ... do stuff to text ...
  *          return text;
  *      },
  *      // ... 
  *   }
  * };
  * ```
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.showdown.mod.Extension_ because Already inherited
- typingsJapgolly.showdown.mod.FilterExtension because var conflicts: listeners, `type`. Inlined filter */ trait ShowdownExtension extends RegexReplaceExtension {
  var filter: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      String
    ]
  ] = js.undefined
}

object ShowdownExtension {
  @scala.inline
  def apply(
    `type`: String,
    filter: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => CallbackTo[String] = null,
    listeners: StringDictionary[EventListener] = null,
    regex: String | js.RegExp = null,
    replace: js.Any = null
  ): ShowdownExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: /* text */ java.lang.String, t1: /* converter */ typingsJapgolly.showdown.mod.Converter, t2: /* options */ js.UndefOr[typingsJapgolly.showdown.mod.ConverterOptions]) => filter(t0, t1, t2).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowdownExtension]
  }
}

