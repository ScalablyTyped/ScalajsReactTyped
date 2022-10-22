package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IPreviewerActiveXCtrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PreviewerActiveXCtrl")
@js.native
open class PreviewerActiveXCtrl ()
  extends StObject
     with IPreviewerActiveXCtrl {
  
  /* CompleteClass */
  override def ClearPreview(): Double = js.native
  
  /* CompleteClass */
  override def ShowFilePreview(bstrFilename: String): Double = js.native
  
  /* CompleteClass */
  override def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: Any,
    bstrSearchConditions: String
  ): Double = js.native
}
