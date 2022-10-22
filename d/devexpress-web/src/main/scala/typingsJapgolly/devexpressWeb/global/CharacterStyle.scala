package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains characteristics of a character style in a document.
  */
@JSGlobal("CharacterStyle")
@js.native
open class CharacterStyle ()
  extends StObject
     with typingsJapgolly.devexpressWeb.CharacterStyle {
  
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  
  /**
    * Gets or sets the linked style for the current style.
    */
  /* CompleteClass */
  override val linkedStyle: typingsJapgolly.devexpressWeb.ParagraphStyle = js.native
  
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
  
  /**
    * Gets the style form which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typingsJapgolly.devexpressWeb.CharacterStyle = js.native
}
