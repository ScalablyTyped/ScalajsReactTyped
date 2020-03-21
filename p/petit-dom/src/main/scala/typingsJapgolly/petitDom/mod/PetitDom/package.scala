package typingsJapgolly.petitDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PetitDom {
  type ComponentProps = js.Object
  type Content = java.lang.String | typingsJapgolly.petitDom.mod.PetitDom.VNode
  type DOMElementProps[E /* <: org.scalajs.dom.raw.Element */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typingsJapgolly.petitDom.petitDomStrings.DOMElementProps with E
  type Key = java.lang.String | scala.Double
  type Props[E /* <: org.scalajs.dom.raw.Element */] = typingsJapgolly.petitDom.mod.PetitDom.IntrinsicProps with typingsJapgolly.petitDom.mod.PetitDom.DOMElementProps[E]
  type ShouldUpdate[P /* <: typingsJapgolly.petitDom.mod.PetitDom.ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[typingsJapgolly.petitDom.mod.PetitDom.VNode], 
    /* oldContent */ js.Array[typingsJapgolly.petitDom.mod.PetitDom.VNode], 
    scala.Boolean
  ]
}
