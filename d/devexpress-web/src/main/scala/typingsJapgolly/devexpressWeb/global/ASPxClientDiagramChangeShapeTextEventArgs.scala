package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramChangeShapeTextEventArgs")
@js.native
open class ASPxClientDiagramChangeShapeTextEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramChangeShapeTextEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramChangeShapeTextEventArgs class with specified settings.
    * @param shape The shape object.
    * @param text The new shape text.
    */
  def this(shape: typingsJapgolly.devexpressWeb.DiagramShape, text: String) = this()
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typingsJapgolly.devexpressWeb.DiagramShape = js.native
  
  /**
    * The new shape text.
    */
  /* CompleteClass */
  var text: String = js.native
}
