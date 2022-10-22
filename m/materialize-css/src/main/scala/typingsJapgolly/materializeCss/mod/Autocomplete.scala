package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.AutocompleteData
import typingsJapgolly.materializeCss.M.AutocompleteOptions
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.anon.PartialAutocompleteOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Autocomplete")
@js.native
open class Autocomplete ()
  extends StObject
     with typingsJapgolly.materializeCss.M.Autocomplete {
  
  /**
    * Index of the current selected option.
    */
  /* CompleteClass */
  var activeIndex: Double = js.native
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Number of matching autocomplete options.
    */
  /* CompleteClass */
  var count: Double = js.native
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: AutocompleteOptions = js.native
  
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  /* CompleteClass */
  override def selectOption(el: Element): Unit = js.native
  
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  /* CompleteClass */
  override def updateData(data: AutocompleteData): Unit = js.native
}
object Autocomplete {
  
  @JSImport("materialize-css", "Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Autocomplete]
  
  /**
    * Init autocomplete
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializeCss.M.Autocomplete = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Autocomplete]
  inline def init(els: Element, options: PartialAutocompleteOption): typingsJapgolly.materializeCss.M.Autocomplete = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializeCss.M.Autocomplete]
  /**
    * Init autocompletes
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Autocomplete] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Autocomplete]]
  inline def init(els: MElements, options: PartialAutocompleteOption): js.Array[typingsJapgolly.materializeCss.M.Autocomplete] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Autocomplete]]
}
