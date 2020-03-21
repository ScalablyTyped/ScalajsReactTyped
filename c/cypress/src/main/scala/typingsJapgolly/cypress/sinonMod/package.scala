package typingsJapgolly.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sinonMod {
  type SinonStatic = typingsJapgolly.cypress.sinonMod.SinonSandbox with typingsJapgolly.cypress.sinonMod.LegacySandbox with typingsJapgolly.cypress.sinonMod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: cypress.cypress/types/sinon.SinonStubbedMember<TType[P]>}
    */ typingsJapgolly.cypress.cypressStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | typingsJapgolly.cypress.sinonMod.SinonStub
  type SinonTimerId = scala.Double | typingsJapgolly.cypress.AnonId
}
