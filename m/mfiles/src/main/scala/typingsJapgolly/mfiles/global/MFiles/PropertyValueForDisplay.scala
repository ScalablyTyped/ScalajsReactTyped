package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IPropertyValue
import typingsJapgolly.mfiles.IPropertyValueForDisplay
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFContentType
import typingsJapgolly.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyValueForDisplay")
@js.native
open class PropertyValueForDisplay ()
  extends StObject
     with IPropertyValueForDisplay {
  
  /* CompleteClass */
  override def Clone(): IPropertyValueForDisplay = js.native
  
  /* CompleteClass */
  override val ContentType: MFContentType = js.native
  
  /* CompleteClass */
  override val DataType: MFDataType = js.native
  
  /* CompleteClass */
  override val DisplayValue: String = js.native
  
  /* CompleteClass */
  override val PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  /* CompleteClass */
  override val PropertyDefName: String = js.native
  
  /* CompleteClass */
  override val PropertyValue: IPropertyValue = js.native
  
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
}
