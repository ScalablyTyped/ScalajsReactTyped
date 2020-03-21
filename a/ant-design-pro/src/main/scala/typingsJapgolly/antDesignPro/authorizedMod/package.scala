package typingsJapgolly.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authorizedMod {
  type IReactComponent[P] = typingsJapgolly.react.mod.StatelessComponent[P] | (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.ClassicComponentClass[P]
  type Secured = js.Function2[
    /* authority */ typingsJapgolly.antDesignPro.authorizedRouteMod.authority, 
    /* error */ js.UndefOr[japgolly.scalajs.react.raw.React.Node], 
    js.Function1[
      /* target */ typingsJapgolly.antDesignPro.authorizedMod.IReactComponent[js.Any], 
      typingsJapgolly.antDesignPro.authorizedMod.IReactComponent[js.Any]
    ]
  ]
  type check = js.Function3[
    /* authority */ typingsJapgolly.antDesignPro.authorizedRouteMod.authority, 
    /* target */ typingsJapgolly.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    /* Exception */ typingsJapgolly.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    typingsJapgolly.antDesignPro.authorizedMod.IReactComponent[js.Any]
  ]
}
