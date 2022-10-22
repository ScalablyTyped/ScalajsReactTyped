package typingsJapgolly.htmlToDraftjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typingsJapgolly.htmlToDraftjs.anon.ContentBlocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-draftjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): ContentBlocks = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[ContentBlocks]
  inline def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[Any]]]
    ]
  ): ContentBlocks = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], customChunkRenderer.asInstanceOf[js.Any])).asInstanceOf[ContentBlocks]
}
