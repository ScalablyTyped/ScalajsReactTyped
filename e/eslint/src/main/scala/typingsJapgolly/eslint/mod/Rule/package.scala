package typingsJapgolly.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Rule {
  type NodeListener = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void}
    */ typingsJapgolly.eslint.eslintStrings.NodeListener with js.Any
  type NodeTypes = /* import warning: importer.ImportType#apply Failed type conversion: estree.estree.Node['type'] */ js.Any
  type ReportDescriptor = typingsJapgolly.eslint.mod.Rule.ReportDescriptorMessage with typingsJapgolly.eslint.mod.Rule.ReportDescriptorLocation with typingsJapgolly.eslint.mod.Rule.ReportDescriptorOptions
}
