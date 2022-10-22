package typingsJapgolly.marko

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.marko.markoBooleans.`false`
import typingsJapgolly.marko.srcComponentsComponentMod.Component
import typingsJapgolly.marko.srcRuntimeDomElementMod.DomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeHtmlRenderResultMod {
  
  @js.native
  trait RenderResult
    extends StObject
       with DomElement {
    
    def apply(out: Any): this.type = js.native
    
    def afterInsert(doc: Document): this.type = js.native
    
    var document: Document | `false` = js.native
    
    def getComponent(): Component = js.native
    
    def getComponents(): js.Array[Component] = js.native
    def getComponents(selector: Any): js.Array[Component] = js.native
    
    def getNode(doc: Document): Node = js.native
    
    def getOutput(): Any = js.native
  }
}
