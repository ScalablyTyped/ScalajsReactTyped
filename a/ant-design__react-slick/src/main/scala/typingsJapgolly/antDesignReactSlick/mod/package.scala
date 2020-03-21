package typingsJapgolly.antDesignReactSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[TProps] = (japgolly.scalajs.react.raw.React.ComponentClassP[TProps with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[TProps]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignReactSlick.antDesignReactSlickStrings.left
    - typingsJapgolly.antDesignReactSlick.antDesignReactSlickStrings.down
    - typingsJapgolly.antDesignReactSlick.antDesignReactSlickStrings.right
    - typingsJapgolly.antDesignReactSlick.antDesignReactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = typingsJapgolly.antDesignReactSlick.mod._SwipeDirection | java.lang.String
}
