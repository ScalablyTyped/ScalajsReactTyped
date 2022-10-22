package typingsJapgolly.leafletEditable.leafletMod

import typingsJapgolly.leaflet.mod.LayerEventHandlerFn
import typingsJapgolly.leaflet.mod.LeafletEventHandlerFn
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColoncreated
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondisable
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrag
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondragend
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondragstart
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColoncancel
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonclicked
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColoncommit
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonend
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonmousedown
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonmouseup
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonmove
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColondrawingColonstart
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonediting
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonenable
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonmiddlemarkerColonmousedown
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonshapeColondelete
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonshapeColondeleted
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonshapeColonnew
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonaltclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonclicked
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColoncontextmenu
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonctrlclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColondeleted
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColondrag
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColondragend
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColondragstart
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonmetakeyclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonmousedown
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonnew
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonrawclick
import typingsJapgolly.leafletEditable.leafletEditableStrings.editableColonvertexColonshiftclick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Extend Evented to add new events.
  */
@js.native
trait Evented extends StObject {
  
  def on(
    `type`: editableColondisable | editableColondrag | editableColondragend | editableColondragstart | editableColondrawingColoncancel | editableColondrawingColonclicked | editableColondrawingColoncommit | editableColondrawingColonend | editableColondrawingColonmousedown | editableColondrawingColonmouseup | editableColondrawingColonmove | editableColondrawingColonstart | editableColonediting | editableColonenable | editableColonmiddlemarkerColonmousedown | editableColonshapeColondeleted | editableColonshapeColonnew | editableColonvertexColonaltclick | editableColonvertexColonclick | editableColonvertexColonclicked | editableColonvertexColoncontextmenu | editableColonvertexColonctrlclick | editableColonvertexColondeleted | editableColonvertexColondrag | editableColonvertexColondragend | editableColonvertexColondragstart | editableColonvertexColonmetakeyclick | editableColonvertexColonmousedown | editableColonvertexColonnew | editableColonvertexColonrawclick | editableColonvertexColonshiftclick,
    fn: CancelableVertexEventHandlerFn | LeafletEventHandlerFn | ShapeEventHandlerFn | VertexEventHandlerFn
  ): this.type = js.native
  def on(
    `type`: editableColondisable | editableColondrag | editableColondragend | editableColondragstart | editableColondrawingColoncancel | editableColondrawingColonclicked | editableColondrawingColoncommit | editableColondrawingColonend | editableColondrawingColonmousedown | editableColondrawingColonmouseup | editableColondrawingColonmove | editableColondrawingColonstart | editableColonediting | editableColonenable | editableColonmiddlemarkerColonmousedown | editableColonshapeColondeleted | editableColonshapeColonnew | editableColonvertexColonaltclick | editableColonvertexColonclick | editableColonvertexColonclicked | editableColonvertexColoncontextmenu | editableColonvertexColonctrlclick | editableColonvertexColondeleted | editableColonvertexColondrag | editableColonvertexColondragend | editableColonvertexColondragstart | editableColonvertexColonmetakeyclick | editableColonvertexColonmousedown | editableColonvertexColonnew | editableColonvertexColonrawclick | editableColonvertexColonshiftclick,
    fn: CancelableVertexEventHandlerFn | LeafletEventHandlerFn | ShapeEventHandlerFn | VertexEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  def on_editablecreated(`type`: editableColoncreated, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editablecreated(`type`: editableColoncreated, fn: LayerEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_editabledrawingclick(`type`: editableColondrawingColonclick, fn: CancelableEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editabledrawingclick(`type`: editableColondrawingColonclick, fn: CancelableEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_editableshapedelete(`type`: editableColonshapeColondelete, fn: CancelableShapeEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editableshapedelete(`type`: editableColonshapeColondelete, fn: CancelableShapeEventHandlerFn, context: Any): this.type = js.native
}
