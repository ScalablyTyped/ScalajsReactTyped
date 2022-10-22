package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.ILookup
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IWorkflow
import typingsJapgolly.mfiles.MFiles.MFBuiltInDocumentClass
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Workflow")
@js.native
open class Workflow ()
  extends StObject
     with IWorkflow {
  
  /* CompleteClass */
  override def Clone(): IWorkflow = js.native
  
  /* CompleteClass */
  override def GetAsLookup(): ILookup = js.native
  
  /* CompleteClass */
  override def GetAsTypedValue(): ITypedValue = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
}
