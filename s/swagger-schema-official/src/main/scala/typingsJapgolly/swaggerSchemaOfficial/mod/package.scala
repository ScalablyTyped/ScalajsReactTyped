package typingsJapgolly.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.swaggerSchemaOfficial.anon.AllowEmptyValue
import typingsJapgolly.swaggerSchemaOfficial.anon.CollectionFormat
import typingsJapgolly.swaggerSchemaOfficial.anon.In
import typingsJapgolly.swaggerSchemaOfficial.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseFormatContrainedParameter = BaseParameter & SchemaFormatConstraints

type FormDataParameter = BaseFormatContrainedParameter & BaseSchema & AllowEmptyValue

type HeaderParameter = BaseFormatContrainedParameter & BaseSchema & In

type OAuthScope = StringDictionary[String]

type Parameter = BodyParameter | FormDataParameter | QueryParameter | PathParameter | HeaderParameter

type PathParameter = BaseFormatContrainedParameter & BaseSchema & Required

type QueryParameter = BaseFormatContrainedParameter & BaseSchema & CollectionFormat
