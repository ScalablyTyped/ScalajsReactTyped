package typingsJapgolly.swaggerSchemaOfficial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseFormatContrainedParameter = typingsJapgolly.swaggerSchemaOfficial.mod.BaseParameter with typingsJapgolly.swaggerSchemaOfficial.mod.SchemaFormatConstraints
  type FormDataParameter = typingsJapgolly.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsJapgolly.swaggerSchemaOfficial.mod.BaseSchema with typingsJapgolly.swaggerSchemaOfficial.AnonCollectionFormat
  type HeaderParameter = typingsJapgolly.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsJapgolly.swaggerSchemaOfficial.mod.BaseSchema with typingsJapgolly.swaggerSchemaOfficial.Anon0
  type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Parameter = typingsJapgolly.swaggerSchemaOfficial.mod.BodyParameter | typingsJapgolly.swaggerSchemaOfficial.mod.FormDataParameter | typingsJapgolly.swaggerSchemaOfficial.mod.QueryParameter | typingsJapgolly.swaggerSchemaOfficial.mod.PathParameter | typingsJapgolly.swaggerSchemaOfficial.mod.HeaderParameter
  type PathParameter = typingsJapgolly.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsJapgolly.swaggerSchemaOfficial.mod.BaseSchema with typingsJapgolly.swaggerSchemaOfficial.AnonIn
  type QueryParameter = typingsJapgolly.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typingsJapgolly.swaggerSchemaOfficial.mod.BaseSchema with typingsJapgolly.swaggerSchemaOfficial.AnonAllowEmptyValue
}
