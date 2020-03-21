package typingsJapgolly.styledComponents.nativeMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme
import typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderComponent
import typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ]) = this()
  def this(
    props: ThemeProviderProps[
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ],
    context: js.Any
  ) = this()
}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[
      ThemeProviderComponent[
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme], 
        typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]
      ]
    ]

