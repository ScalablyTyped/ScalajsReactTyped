package typingsJapgolly.popoto.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.SVGGElement
import typingsJapgolly.popoto.graphMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxonomy extends StObject {
  
  /**
    * Add children providers data.
    * @param parentData
    * @param id
    */
  def addChildrenData(parentData: Node, id: Double): Double
  
  /**
    * Recursively generate the taxonomy children elements.
    *
    * @param selection
    */
  def addTaxonomyChildren(selection: js.Array[Element]): Unit
  
  val containerId: String
  
  /**
    * Create the taxonomy panel HTML elements.
    */
  def createTaxonomyPanel(): Unit
  
  /**
    * Recursive function to flatten data content.
    */
  def flattenChildren(d: SVGGElement, vals: js.Array[Any]): Unit
  
  /**
    * Parse the list of label providers and return a list of data object containing only searchable labels.
    * @returns Array
    */
  def generateTaxonomiesData(): js.Array[Any]
  
  def onClick(): Unit
  
  /**
    * Updates the count number on a taxonomy.
    *
    * @param taxonomyData
    */
  def updateCount(taxonomyData: js.Array[Any]): Unit
}
object TypeofTaxonomy {
  
  inline def apply(
    addChildrenData: (Node, Double) => Double,
    addTaxonomyChildren: js.Array[Element] => Callback,
    containerId: String,
    createTaxonomyPanel: Callback,
    flattenChildren: (SVGGElement, js.Array[Any]) => Callback,
    generateTaxonomiesData: CallbackTo[js.Array[Any]],
    onClick: Callback,
    updateCount: js.Array[Any] => Callback
  ): TypeofTaxonomy = {
    val __obj = js.Dynamic.literal(addChildrenData = js.Any.fromFunction2(addChildrenData), addTaxonomyChildren = js.Any.fromFunction1((t0: js.Array[Element]) => addTaxonomyChildren(t0).runNow()), containerId = containerId.asInstanceOf[js.Any], createTaxonomyPanel = createTaxonomyPanel.toJsFn, flattenChildren = js.Any.fromFunction2((t0: SVGGElement, t1: js.Array[Any]) => (flattenChildren(t0, t1)).runNow()), generateTaxonomiesData = generateTaxonomiesData.toJsFn, onClick = onClick.toJsFn, updateCount = js.Any.fromFunction1((t0: js.Array[Any]) => updateCount(t0).runNow()))
    __obj.asInstanceOf[TypeofTaxonomy]
  }
  
  extension [Self <: TypeofTaxonomy](x: Self) {
    
    inline def setAddChildrenData(value: (Node, Double) => Double): Self = StObject.set(x, "addChildrenData", js.Any.fromFunction2(value))
    
    inline def setAddTaxonomyChildren(value: js.Array[Element] => Callback): Self = StObject.set(x, "addTaxonomyChildren", js.Any.fromFunction1((t0: js.Array[Element]) => value(t0).runNow()))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setCreateTaxonomyPanel(value: Callback): Self = StObject.set(x, "createTaxonomyPanel", value.toJsFn)
    
    inline def setFlattenChildren(value: (SVGGElement, js.Array[Any]) => Callback): Self = StObject.set(x, "flattenChildren", js.Any.fromFunction2((t0: SVGGElement, t1: js.Array[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGenerateTaxonomiesData(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "generateTaxonomiesData", value.toJsFn)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setUpdateCount(value: js.Array[Any] => Callback): Self = StObject.set(x, "updateCount", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
