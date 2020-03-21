package typingsJapgolly.mdxJsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: java.lang.String */] = typingsJapgolly.std.Pick[ObjectType, typingsJapgolly.std.Exclude[java.lang.String, KeysType]]
  type MDXProviderComponentsProp = typingsJapgolly.mdxJsReact.mod.MDXProviderComponents | (js.Function1[
    /* components */ typingsJapgolly.mdxJsReact.mod.MDXProviderComponents, 
    typingsJapgolly.mdxJsReact.mod.MDXProviderComponents
  ])
}
