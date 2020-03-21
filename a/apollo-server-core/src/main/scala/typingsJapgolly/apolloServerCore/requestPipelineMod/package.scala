package typingsJapgolly.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestPipelineMod {
  type DataSources[TContext] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.apolloDatasource.mod.DataSource[TContext]]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typingsJapgolly.apolloServerCore.apolloServerCoreStrings.Mutable with T
}
