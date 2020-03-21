package typingsJapgolly.sauronjs

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sauronjs.componentMod.ComponentParameters
import typingsJapgolly.sauronjs.componentMod.^
import typingsJapgolly.sauronjs.sauronMod.SauronComponentMap
import typingsJapgolly.sauronjs.sauronMod.SauronInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Component protected () extends ^ {
    def this(params: ComponentParameters) = this()
  }
  
  @js.native
  class Service protected ()
    extends typingsJapgolly.sauronjs.serviceMod.^ {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    var _index: Double = js.native
  }
  
  @js.native
  object events extends js.Object {
    @js.native
    object dom extends js.Object {
      def update(): Unit = js.native
    }
    
  }
  
  @js.native
  object instance extends js.Object {
    def apply(componentMap: SauronComponentMap): SauronInstance = js.native
    def apply(componentMap: SauronComponentMap, id: String): SauronInstance = js.native
  }
  
  @js.native
  object util extends js.Object {
    @js.native
    object insert extends js.Object {
      def apply(params: HTMLElement): Unit = js.native
    }
    
    @js.native
    object ready extends js.Object {
      def apply(fn: js.Function0[Unit]): Unit = js.native
    }
    
  }
  
}

