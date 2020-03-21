package typingsJapgolly.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.codemirror.AnonChanged
import typingsJapgolly.codemirror.AnonDoc
import typingsJapgolly.tern.ternMod.Query
import typingsJapgolly.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TernServer extends js.Object {
  val docs: StringDictionary[AnonChanged] = js.native
  val options: TernOptions = js.native
  val server: Server = js.native
  def addDoc(name: String, doc: Doc): AnonDoc = js.native
  def complete(cm: Doc): Unit = js.native
  def delDoc(id: String): Unit = js.native
  def delDoc(id: Doc): Unit = js.native
  def delDoc(id: Editor): Unit = js.native
  def destroy(): Unit = js.native
  def hideDoc(id: String): Unit = js.native
  def hideDoc(id: Doc): Unit = js.native
  def hideDoc(id: Editor): Unit = js.native
  def jumpBack(cm: Doc): Unit = js.native
  def jumpToDef(cm: Doc): Unit = js.native
  def rename(cm: Doc): Unit = js.native
  def request[Q /* <: Query */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  def request[Q /* <: Query */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q['type']]['result'] */ js.Any
      ], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  @JSName("request")
  def request_result[Q /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](
    cm: Doc,
    query: Q,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[Q]['result'] */ js.Any
      ], 
      Unit
    ],
    pos: Position
  ): Unit = js.native
  def selectName(cm: Doc): Unit = js.native
  def showDocs(cm: Doc): Unit = js.native
  def showDocs(cm: Doc, pos: Double): Unit = js.native
  def showDocs(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showDocs(cm: Doc, pos: Position): Unit = js.native
  def showDocs(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def showType(cm: Doc): Unit = js.native
  def showType(cm: Doc, pos: Double): Unit = js.native
  def showType(cm: Doc, pos: Double, callback: js.Function): Unit = js.native
  def showType(cm: Doc, pos: Position): Unit = js.native
  def showType(cm: Doc, pos: Position, callback: js.Function): Unit = js.native
  def updateArgHints(cm: Doc): Unit = js.native
}

@JSImport("codemirror", "TernServer")
@js.native
object TernServer extends TopLevel[TernConstructor]

