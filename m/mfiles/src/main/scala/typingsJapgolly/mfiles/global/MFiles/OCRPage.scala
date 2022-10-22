package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IOCRPage
import typingsJapgolly.mfiles.IOCRZones
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.OCRPage")
@js.native
open class OCRPage ()
  extends StObject
     with IOCRPage {
  
  /* CompleteClass */
  override def Clone(): IOCRPage = js.native
  
  /* CompleteClass */
  var OCRZones: IOCRZones = js.native
  
  /* CompleteClass */
  var PageNum: Double = js.native
}
