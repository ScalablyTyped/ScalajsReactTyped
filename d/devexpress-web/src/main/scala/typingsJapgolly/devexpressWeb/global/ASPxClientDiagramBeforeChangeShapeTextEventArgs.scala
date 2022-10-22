package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramBeforeChangeShapeTextEventArgs")
@js.native
open class ASPxClientDiagramBeforeChangeShapeTextEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagramBeforeChangeShapeTextEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramBeforeChangeShapeTextEventArgs class with specified settings.
    * @param shape The shape object.
    */
  def this(shape: typingsJapgolly.devexpressWeb.DiagramShape) = this()
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typingsJapgolly.devexpressWeb.DiagramShape = js.native
}
