package typingsJapgolly.ckeditorCkeditor5Heading

import typingsJapgolly.ckeditorCkeditor5Heading.srcHeadingMod.HeadingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@ckeditor/ckeditor5-heading/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalizedOptions(
    editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
  ): js.Array[HeadingOption] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalizedOptions")(editor.asInstanceOf[js.Any]).asInstanceOf[js.Array[HeadingOption]]
}
