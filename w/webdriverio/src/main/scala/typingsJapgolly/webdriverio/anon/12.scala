package typingsJapgolly.webdriverio.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.NonNullable
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typingsJapgolly.webdriverio.webdriverioStrings.`object`
import typingsJapgolly.webdriverio.webdriverioStrings.boolean
import typingsJapgolly.webdriverio.webdriverioStrings.function
import typingsJapgolly.webdriverio.webdriverioStrings.number
import typingsJapgolly.webdriverio.webdriverioStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var default: js.UndefOr[
    (js.Function3[
      /* capabilities */ RemoteCapability, 
      /* specs */ js.Array[String], 
      /* browser */ Any, 
      Unit
    ]) | (js.Array[
      NonNullable[
        js.UndefOr[
          js.Function3[
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* browser */ Any, 
            Unit
          ]
        ]
      ]
    ])
  ] = js.undefined
  
  var `match`: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: string | number | `object` | boolean | function
  
  var validate: js.UndefOr[
    js.Function1[
      /* option */ js.UndefOr[
        (js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* browser */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ], 
      Unit
    ]
  ] = js.undefined
}
object `12` {
  
  inline def apply(`type`: string | number | `object` | boolean | function): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setDefault(
      value: (js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* browser */ Any, 
                Unit
              ]
            ]
          ]
        ])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction3(
      value: (/* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* browser */ Any) => Callback
    ): Self = StObject.set(x, "default", js.Any.fromFunction3((t0: /* capabilities */ RemoteCapability, t1: /* specs */ js.Array[String], t2: /* browser */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(
      value: (NonNullable[
          js.UndefOr[
            js.Function3[
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* browser */ Any, 
              Unit
            ]
          ]
        ])*
    ): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: string | number | `object` | boolean | function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(
      value: /* option */ js.UndefOr[
          (js.Function3[
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* browser */ Any, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function3[
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* browser */ Any, 
                  Unit
                ]
              ]
            ]
          ])
        ] => Callback
    ): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* option */ js.UndefOr[
          (js.Function3[
            /* capabilities */ RemoteCapability, 
            /* specs */ js.Array[String], 
            /* browser */ Any, 
            Unit
          ]) | (js.Array[
            NonNullable[
              js.UndefOr[
                js.Function3[
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* browser */ Any, 
                  Unit
                ]
              ]
            ]
          ])
        ]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
