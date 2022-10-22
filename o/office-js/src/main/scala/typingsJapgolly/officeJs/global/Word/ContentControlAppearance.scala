package typingsJapgolly.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContentControl appearance.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  *
  * Content control appearance options are BoundingBox, Tags, or Hidden.
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Word.ContentControlAppearance & String] = js.native
  
  /* "BoundingBox" */ val boundingBox: typingsJapgolly.officeJs.Word.ContentControlAppearance.boundingBox & String = js.native
  
  /* "Hidden" */ val hidden: typingsJapgolly.officeJs.Word.ContentControlAppearance.hidden & String = js.native
  
  /* "Tags" */ val tags: typingsJapgolly.officeJs.Word.ContentControlAppearance.tags & String = js.native
}
