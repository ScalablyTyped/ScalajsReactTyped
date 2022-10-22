package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IOCRPage
import typingsJapgolly.mfiles.IOCRPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.OCRPages")
@js.native
open class OCRPages ()
  extends StObject
     with IOCRPages {
  
  /* CompleteClass */
  override def Add(Index: Double, OCRPage: IOCRPage): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IOCRPages = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IOCRPage = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
