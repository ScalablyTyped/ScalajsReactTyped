package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAssociatedPropertyDef
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AssociatedPropertyDef")
@js.native
open class AssociatedPropertyDef ()
  extends StObject
     with IAssociatedPropertyDef {
  
  /* CompleteClass */
  override def Clone(): IAssociatedPropertyDef = js.native
  
  /* CompleteClass */
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  /* CompleteClass */
  var Required: Boolean = js.native
}
