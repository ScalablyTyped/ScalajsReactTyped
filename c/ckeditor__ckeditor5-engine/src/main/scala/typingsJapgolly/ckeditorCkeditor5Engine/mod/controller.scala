package typingsJapgolly.ckeditorCkeditor5Engine.mod

import typingsJapgolly.ckeditorCkeditor5Engine.Anon0
import typingsJapgolly.ckeditorCkeditor5Engine.AnonPriority
import typingsJapgolly.ckeditorCkeditor5Engine.mod.conversion.DowncastDispatcher
import typingsJapgolly.ckeditorCkeditor5Engine.mod.conversion.Mapper
import typingsJapgolly.ckeditorCkeditor5Engine.mod.conversion.UpcastDispatcher
import typingsJapgolly.ckeditorCkeditor5Engine.mod.dataprocessor.DataProcessor
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Model
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.SchemaContextDefinition
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.View
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Emitter
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "controller")
@js.native
object controller extends js.Object {
  // engine/controller/datacontroller
  @js.native
  class DataController protected () extends Observable {
    def this(model: Model) = this()
    def this(model: Model, dataProcessor: DataProcessor) = this()
    val downcastDispatcher: DowncastDispatcher = js.native
    val mapper: Mapper = js.native
    val model: Model = js.native
    val processor: DataProcessor = js.native
    val upcastDispatcher: UpcastDispatcher = js.native
    def destroy(): Unit = js.native
    def get(): String = js.native
    def get(rootName: String): String = js.native
    def init(data: String): js.Promise[_] = js.native
    def init(data: String, rootName: String): js.Promise[_] = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
    def parse(data: String): DocumentFragment = js.native
    def parse(data: String, context: SchemaContextDefinition): DocumentFragment = js.native
    def stringify(modelElementOrFragment: DocumentFragment): String = js.native
    def stringify(modelElementOrFragment: Element): String = js.native
    def toModel(viewElementOrFragment: DocumentFragment): DocumentFragment = js.native
    def toModel(viewElementOrFragment: DocumentFragment, context: SchemaContextDefinition): DocumentFragment = js.native
    def toModel(viewElementOrFragment: Element): DocumentFragment = js.native
    def toModel(viewElementOrFragment: Element, context: SchemaContextDefinition): DocumentFragment = js.native
    def toView(modelElementOrFragment: DocumentFragment): DocumentFragment = js.native
    def toView(modelElementOrFragment: Element): DocumentFragment = js.native
  }
  
  // engine/controller/editingcontroller
  @js.native
  class EditingController protected () extends Observable {
    def this(model: Model) = this()
    val downcastDispatcher: DowncastDispatcher = js.native
    val mapper: Mapper = js.native
    val model: Model = js.native
    val view: View = js.native
    def destroy(): Unit = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
  }
  
}

