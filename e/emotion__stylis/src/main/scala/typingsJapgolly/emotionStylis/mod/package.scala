package typingsJapgolly.emotionStylis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugable = js.UndefOr[
    scala.Null | scala.Boolean | typingsJapgolly.emotionStylis.mod.Plugin | typingsJapgolly.emotionStylis.mod.ArrayPlugable
  ]
  type Plugin = js.ThisFunction9[
    /* this */ typingsJapgolly.emotionStylis.mod.Stylis, 
    /* context */ typingsJapgolly.emotionStylis.mod.Context, 
    /* content */ js.Any, 
    /* selector */ js.Array[java.lang.String], 
    /* parent */ js.Array[java.lang.String], 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    /* at */ scala.Double, 
    /* depth */ scala.Double, 
    js.Any
  ]
  type Prefix = scala.Boolean | (js.Function3[
    /* key */ java.lang.String, 
    /* value */ java.lang.String, 
    /* context */ typingsJapgolly.emotionStylis.mod.PrefixContext, 
    scala.Boolean
  ])
  type StylisSet = js.Function1[
    /* options */ typingsJapgolly.emotionStylis.mod.Options, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object
  ]
  type StylisUse = js.Function1[
    /* plugin */ js.UndefOr[typingsJapgolly.emotionStylis.mod.Plugable], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object
  ]
}
