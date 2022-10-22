package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAdditionalFolder
import typingsJapgolly.mfiles.IImpersonation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AdditionalFolder")
@js.native
open class AdditionalFolder ()
  extends StObject
     with IAdditionalFolder {
  
  /* CompleteClass */
  override def Clone(): IAdditionalFolder = js.native
  
  /* CompleteClass */
  var Folder: String = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var LimitInMB: Double = js.native
}
