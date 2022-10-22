package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IPropertyValueSuggestion
import typingsJapgolly.mfiles.ITypedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyValueSuggestion")
@js.native
open class PropertyValueSuggestion ()
  extends StObject
     with IPropertyValueSuggestion {
  
  /* CompleteClass */
  override def Clone(): IPropertyValueSuggestion = js.native
  
  /* CompleteClass */
  override val IsFact: Boolean = js.native
  
  /* CompleteClass */
  override val Quality: Double = js.native
  
  /* CompleteClass */
  override val TypedValue: ITypedValue = js.native
}
