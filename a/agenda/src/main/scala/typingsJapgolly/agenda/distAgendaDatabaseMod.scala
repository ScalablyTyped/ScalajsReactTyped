package typingsJapgolly.agenda

import typingsJapgolly.agenda.distAgendaMod.Agenda
import typingsJapgolly.mongodb.mod.AnyError
import typingsJapgolly.mongodb.mod.Collection
import typingsJapgolly.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaDatabaseMod {
  
  @JSImport("agenda/dist/agenda/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def database(url: String): Agenda | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any]).asInstanceOf[Agenda | Unit]
  inline def database(url: String, collection: String): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(
    url: String,
    collection: String,
    options: Unit,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(url: String, collection: String, options: MongoClientOptions): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(
    url: String,
    collection: String,
    options: MongoClientOptions,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(
    url: String,
    collection: Unit,
    options: Unit,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(url: String, collection: Unit, options: MongoClientOptions): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
  inline def database(
    url: String,
    collection: Unit,
    options: MongoClientOptions,
    cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
  ): Agenda | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("database")(url.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Agenda | Unit]
}
