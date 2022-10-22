package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdast.mod.ThematicBreak
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleThematicBreakMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/thematic-break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def thematicBreak(_underscore: ThematicBreak_, _1: Null, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def thematicBreak(_underscore: ThematicBreak_, _1: Unit, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def thematicBreak(_underscore: ThematicBreak_, _1: Parent, context: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("thematicBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type ThematicBreak_ = ThematicBreak
}
