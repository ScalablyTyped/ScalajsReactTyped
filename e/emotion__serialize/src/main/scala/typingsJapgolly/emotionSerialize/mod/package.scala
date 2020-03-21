package typingsJapgolly.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsJapgolly.emotionSerialize.mod.ComponentSelector
    - typingsJapgolly.emotionSerialize.mod.Keyframes
    - typingsJapgolly.emotionUtils.mod.SerializedStyles
    - typingsJapgolly.emotionSerialize.mod.CSSObject
    - typingsJapgolly.emotionSerialize.mod.ArrayCSSInterpolation
  */
  type CSSInterpolation = js.UndefOr[
    typingsJapgolly.emotionSerialize.mod._CSSInterpolation | scala.Null | scala.Boolean | scala.Double | java.lang.String | typingsJapgolly.emotionSerialize.mod.Keyframes | typingsJapgolly.emotionUtils.mod.SerializedStyles
  ]
  type CSSProperties = typingsJapgolly.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsJapgolly.emotionSerialize.mod.ComponentSelector
    - typingsJapgolly.emotionSerialize.mod.Keyframes
    - typingsJapgolly.emotionUtils.mod.SerializedStyles
    - typingsJapgolly.emotionSerialize.mod.ArrayInterpolation[MP]
    - typingsJapgolly.emotionSerialize.mod.ObjectInterpolation[MP]
    - typingsJapgolly.emotionSerialize.helperMod.Equal[
  MP, 
  js.UndefOr[scala.Nothing], 
  scala.Nothing, 
  typingsJapgolly.emotionSerialize.mod.FunctionInterpolation[MP]]
  */
  type Interpolation[MP] = js.UndefOr[
    typingsJapgolly.emotionSerialize.mod._Interpolation[MP] | (typingsJapgolly.emotionSerialize.helperMod.Equal[
      MP, 
      js.UndefOr[scala.Nothing], 
      scala.Nothing, 
      typingsJapgolly.emotionSerialize.mod.FunctionInterpolation[MP]
    ]) | scala.Null | scala.Boolean | scala.Double | java.lang.String | typingsJapgolly.emotionSerialize.mod.Keyframes | typingsJapgolly.emotionUtils.mod.SerializedStyles
  ]
  type Keyframes = typingsJapgolly.emotionSerialize.AnonAnim with java.lang.String
}
