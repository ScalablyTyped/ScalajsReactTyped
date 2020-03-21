package typingsJapgolly.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationContextMod {
  type SDLValidationRule = js.Function1[
    /* context */ typingsJapgolly.graphql.validationContextMod.SDLValidationContext, 
    typingsJapgolly.graphql.visitorMod.ASTVisitor
  ]
  type ValidationRule = js.Function1[
    /* context */ typingsJapgolly.graphql.validationContextMod.ValidationContext, 
    typingsJapgolly.graphql.visitorMod.ASTVisitor
  ]
}
