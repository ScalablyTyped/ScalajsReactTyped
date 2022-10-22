package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompositeElementLite
  extends StObject
     with IBase {
  
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @returns Ext.dom.CompositeElement This Composite object.
    */
  var add: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  
  /** [Method] Removes all elements from this Composite
    * @param removeDom Boolean True to also remove the elements from the document.
    */
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Returns true if this composite contains the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElement this
    */
  var each: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.undefined
  
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElement Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElement this
    */
  var fill: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElement this
    */
  var filter: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  
  /** [Method] Returns the first Element
    * @returns Ext.dom.Element
    */
  var first: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Returns the number of elements in this Composite
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Find the index of the passed element within the composite collection
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
    * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[Any], Double]] = js.undefined
  
  /** [Property] (Boolean) */
  var isComposite: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
    * @param index Number
    * @returns Ext.dom.Element
    */
  var item: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typingsJapgolly.extjs.Ext.dom.IElement]
  ] = js.undefined
  
  /** [Method] Returns the last Element
    * @returns Ext.dom.Element
    */
  var last: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean True to also remove the element from the document.
    * @returns Ext.dom.CompositeElement this
    */
  var removeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean True to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElement this
    */
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[Any], 
      /* replacement */ js.UndefOr[Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  
  /** [Method] Gets a range nodes
    * @param start Number The index of the first node in the range
    * @param end Number The index of the last node in the range
    * @returns HTMLElement[] An array of nodes
    */
  var slice: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
}
object ICompositeElementLite {
  
  inline def apply(): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElementLite]
  }
  
  extension [Self <: ICompositeElementLite](x: Self) {
    
    inline def setAdd(value: /* els */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setClear(value: /* removeDom */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: /* removeDom */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setContains(value: /* el */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setEach(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setElements(value: Array): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setFill(value: /* els */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(value: /* selector */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.dom.ICompositeElement): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFirst(value: CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setIndexOf(value: /* el */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setIsComposite(value: Boolean): Self = StObject.set(x, "isComposite", value.asInstanceOf[js.Any])
    
    inline def setIsCompositeUndefined: Self = StObject.set(x, "isComposite", js.undefined)
    
    inline def setItem(value: /* index */ js.UndefOr[Double] => typingsJapgolly.extjs.Ext.dom.IElement): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLast(value: CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]): Self = StObject.set(x, "last", value.toJsFn)
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setRemoveElement(
      value: (/* el */ js.UndefOr[Any], /* removeDom */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ): Self = StObject.set(x, "removeElement", js.Any.fromFunction2(value))
    
    inline def setRemoveElementUndefined: Self = StObject.set(x, "removeElement", js.undefined)
    
    inline def setReplaceElement(
      value: (/* el */ js.UndefOr[Any], /* replacement */ js.UndefOr[Any], /* domReplace */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ): Self = StObject.set(x, "replaceElement", js.Any.fromFunction3(value))
    
    inline def setReplaceElementUndefined: Self = StObject.set(x, "replaceElement", js.undefined)
    
    inline def setSlice(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
