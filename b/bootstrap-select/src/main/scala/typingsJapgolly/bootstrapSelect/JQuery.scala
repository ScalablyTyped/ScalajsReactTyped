package typingsJapgolly.bootstrapSelect

import typingsJapgolly.bootstrapSelect.anon.PartialBootstrapSelectOpt
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.`val`
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.add
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.changedDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.deselectAll
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.destroy
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.hiddenDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.hide
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.hideDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.loadedDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.mobile
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.refresh
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.refreshedDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.remove
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.render
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.renderedDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.selectAll
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.setStyle
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.show
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.showDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.shownDotbsDotselect
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery[TElement] extends StObject {
  
  def on[K /* <: /* keyof bootstrap-select.BootstrapSelectEvents */ showDotbsDotselect | shownDotbsDotselect | hideDotbsDotselect | hiddenDotbsDotselect | loadedDotbsDotselect | renderedDotbsDotselect | refreshedDotbsDotselect | changedDotbsDotselect */](
    eventName: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any
  ): this.type
  
  /**
    * Main function
    */
  def selectpicker(): JQuery[TElement]
  def selectpicker(method: selectAll | deselectAll | render | mobile | refresh | toggle | hide | show | destroy): JQuery[TElement]
  def selectpicker(method: setStyle, className: String, action: add | remove): JQuery[TElement]
  def selectpicker(method: setStyle, className: Unit, action: add | remove): JQuery[TElement]
  def selectpicker(opts: PartialBootstrapSelectOpt): JQuery[TElement]
  @JSName("selectpicker")
  var selectpicker_Original: BootstrapSelect[TElement]
  @JSName("selectpicker")
  def selectpicker_setStyle(method: setStyle): JQuery[TElement]
  @JSName("selectpicker")
  def selectpicker_setStyle(method: setStyle, className: String): JQuery[TElement]
  /**
    * Methods
    * @see {@link https://developer.snapappointments.com/bootstrap-select/methods/}
    */
  @JSName("selectpicker")
  def selectpicker_val(method: `val`, value: String): JQuery[TElement]
  @JSName("selectpicker")
  def selectpicker_val(method: `val`, value: js.Array[String]): JQuery[TElement]
}
object JQuery {
  
  inline def apply[TElement](
    on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any) => JQuery[TElement],
    selectpicker: BootstrapSelect[TElement]
  ): JQuery[TElement] = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), selectpicker = selectpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery[TElement]]
  }
  
  extension [Self <: JQuery[?], TElement](x: Self & JQuery[TElement]) {
    
    inline def setOn(
      value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: bootstrap-select.BootstrapSelectEvents[K] */ js.Any) => JQuery[TElement]
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSelectpicker(value: BootstrapSelect[TElement]): Self = StObject.set(x, "selectpicker", value.asInstanceOf[js.Any])
  }
}
