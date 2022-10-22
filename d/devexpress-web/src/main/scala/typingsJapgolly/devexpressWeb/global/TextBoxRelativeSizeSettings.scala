package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains relative size settings for floating objects.
  */
@JSGlobal("TextBoxRelativeSizeSettings")
@js.native
open class TextBoxRelativeSizeSettings ()
  extends StObject
     with typingsJapgolly.devexpressWeb.TextBoxRelativeSizeSettings {
  
  /**
    * Gets or sets the percentage specifying a floating object's height relative to the element defined by the TextBoxRelativeSizeSettings.relativeHeightType property.
    */
  /* CompleteClass */
  var relativeHeight: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the floating object height is relative.
    */
  /* CompleteClass */
  var relativeHeightType: typingsJapgolly.devexpressWeb.FloatingObjectRelativeHeightType = js.native
  
  /**
    * Gets or sets the percentage specifying a floating object's width relative to the element defined by the TextBoxRelativeSizeSettings.relativeWidthType property.
    */
  /* CompleteClass */
  var relativeWidth: Double = js.native
  
  /**
    * Gets or sets a value specifying to what element the floating object width is relative.
    */
  /* CompleteClass */
  var relativeWidthType: typingsJapgolly.devexpressWeb.FloatingObjectRelativeWidthType = js.native
}
