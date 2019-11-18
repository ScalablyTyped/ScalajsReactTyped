package typingsJapgolly.styledDashComponents.nativeMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ], 
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ]
      ], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ], 
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ]
      ]) = this()
  def this(
    props: ThemeProviderProps[
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ], 
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
          typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
        ]
      ],
    context: js.Any
  ) = this()
}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[
      ThemeProviderComponent[
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme], 
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
      ]
    ]

