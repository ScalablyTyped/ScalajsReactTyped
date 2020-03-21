package typingsJapgolly.expressJsonschema

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonSchemaCustomPropertyError protected () extends js.Object {
    def this(propertyName: String) = this()
    var message: String = js.native
    var name: String = js.native
  }
  
  @js.native
  class JsonSchemaValidation protected () extends js.Object {
    def this(validations: StringDictionary[AnonInstance]) = this()
    var message: String = js.native
    var name: String = js.native
    var validations: StringDictionary[js.Array[AnonMessages]] = js.native
  }
  
  def addSchemaProperties(
    newProperties: StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        Unit | String
      ]
    ]
  ): Unit = js.native
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

