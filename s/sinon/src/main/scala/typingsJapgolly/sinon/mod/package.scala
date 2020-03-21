package typingsJapgolly.sinon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SinonStatic = typingsJapgolly.sinon.mod.SinonSandbox with typingsJapgolly.sinon.mod.LegacySandbox with typingsJapgolly.sinon.mod.SinonApi
  /**
    * An instance of a stubbed object type with functions replaced by stubs.
    *
    * @template TType Object type being stubbed.
    */
  type SinonStubbedInstance[TType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TType ]: sinon.sinon.SinonStubbedMember<TType[P]>}
    */ typingsJapgolly.sinon.sinonStrings.SinonStubbedInstance with TType
  /**
    * Replaces a type with a Sinon stub if it's a function.
    */
  type SinonStubbedMember[T] = T | typingsJapgolly.sinon.mod.SinonStub
  type SinonTimerId = scala.Double | typingsJapgolly.sinon.AnonId
}
